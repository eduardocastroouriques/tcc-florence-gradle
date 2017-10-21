package com.software.florence.common.util.ftp;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;

@Component
public class FTPSender {

    public void send(String path, MultipartFile multipartFile){

        String server = "ftp.florence.kinghost.net";
        int port = 22;
        String user = "florence";
        String pass = "eduardo123456";

        try {

            JSch jsch = new JSch();
            Session session = jsch.getSession( user, server, port );
            session.setConfig( "PreferredAuthentications", "password" );
            session.setConfig( "StrictHostKeyChecking", "no" );
            session.setPassword( pass );
            session.connect( 9999 );
            Channel channel = session.openChannel( "sftp" );
            ChannelSftp sftp = ( ChannelSftp ) channel;
            sftp.connect( 9999 );

            ((ChannelSftp) channel).cd(path);

            ((ChannelSftp) channel).put(multipartFile.getInputStream(), multipartFile.getOriginalFilename());

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
