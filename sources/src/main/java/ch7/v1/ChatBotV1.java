package ch7.v1;

public class ChatBotV1 {
    public ChatBotV1() {}

    void writeMessage(BotMessage message) {
        // send message
        System.out.println(String.format("Sending message: id=%s message=%s", message.getId(), message.getMessage()));
    }
}
