public class Test
{
    public void testFuncionalidad01()
    {
        MailServer gmail = new MailServer();
        MailClient luis = new MailClient(gmail, "luis");
        MailClient pepe = new MailClient(gmail, "pepe");
        luis.sendMailItem ("pepe", "saludos", "hola");
        pepe.totalCorreos();
    }
}