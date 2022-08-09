package co.develhope.Servizi.Web.Socket1.entities;

public class MessageFromClientDTO {
    private String from;
    private String text;

    public MessageFromClientDTO() {
    }

    public MessageFromClientDTO(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
