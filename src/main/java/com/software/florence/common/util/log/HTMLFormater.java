package com.software.florence.common.util.log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class HTMLFormater extends Formatter {

	@Override
	public String format(LogRecord record) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("	<tbody>\n");
		
		if (record.getLevel().intValue() == Level.SEVERE.intValue()) {
			sb.append("		<tr class='bg-danger'>\n");
		} else if (record.getLevel().intValue() == Level.WARNING.intValue()) {
			sb.append("		<tr class='bg-warning'>\n");
		} else if (record.getLevel().intValue() == Level.INFO.intValue()) {
			sb.append("		<tr class='bg-info'>\n");
		} else {
			sb.append("		<tr class='bg-success'>\n");
		}

		// Coluna Tipo
		sb.append("		<td>\n");
		if (record.getLevel().intValue() >= Level.WARNING.intValue()) {
			sb.append("		<strong>");
			sb.append(record.getLevel());
			sb.append("		</strong>");
		} else {
			sb.append(record.getLevel());
		}// if-else
		sb.append("		</td>\n");
		
		// Coluna mensagem
		sb.append("		<td>\n");
		if (record.getLevel().intValue() >= Level.WARNING.intValue()) {
			sb.append("		<strong>");
			sb.append(formatMessage(record));
			sb.append("		</strong>");
		} else {
			sb.append(formatMessage(record));
		}
		sb.append("		</td>\n");
		
		// Coluna data hora
		sb.append("		<td>\n");
		if (record.getLevel().intValue() >= Level.WARNING.intValue()) {
			sb.append("		<strong>");
			sb.append(milliToDate(record.getMillis()));
			sb.append("		</strong>");
		} else {
			sb.append(milliToDate(record.getMillis()));
		}// if-else
		sb.append("		</td>\n");
		
		sb.append("		</tr>\n");
		sb.append("	</tbody>\n");

		return sb.toString();
	}// format()

	private String milliToDate(long millis) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return format.format(new Date(millis));
	}// milliToDate()

	@Override
	public String getHead(Handler h) {
		
		StringBuilder head = new StringBuilder();
		head.append("<html lang='pt-br' >\n")
			.append("<head>\n")
			.append("	<meta charset='utf-8'>\n")
			.append("	<meta content='IE=edge' http-equiv='X-UA-Compatible'>\n")
			.append("	<meta content='width=device-width,initial-scale=1' name='viewport'>\n")
			.append("	<title> LOG BADESC </title>\n")
			.append("	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>\n")
			.append("</head>\n")
			.append("<body>\n\n")
			.append("	<h1>LOG BADESC</h1>\n\n")
			.append("	<table class='table' >\n")
			.append("	<thead>\n")
			.append("	<tr>\n")
			.append("	<td>\n")
			.append("	Tipo de Log")
			.append("	</td>\n")
			.append("	<td>\n")
			.append("	Registro")
			.append("	</td>\n")
			.append("	<td>\n")
			.append("	Data / Hora")
			.append("	</td>\n")
			.append("	</tr>\n");
		
		return head.toString();//"\n\n charset=utf-8\">\n\n\n<pre>\n</pre> <table>border>\n  </table> <tr><th>Nivel</th><th>Data</th><th>Mensagem</th></tr>\n";
	}// getHead()

	@Override
	public String getTail(Handler h) {
		
		StringBuilder tail = new StringBuilder();
		tail.append("	</table>")
			.append("</body>")
			.append("</html>");
		
		return tail.toString();// "\n  \n\n";
	}// getTail()
	
}