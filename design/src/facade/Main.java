package facade;

public class Main {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileConnect();
//        writer.fileDisconnect();
//        ftpClient.disconnect();
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        SftpClient sftpClient = new SftpClient(ftpClient,reader,writer);
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disconnect();


    }
}
