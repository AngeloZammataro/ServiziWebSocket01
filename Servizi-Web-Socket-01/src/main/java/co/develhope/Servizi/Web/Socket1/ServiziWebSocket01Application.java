/*
Servizi - Web Socket 01

    write a Spring Boot application with the necessary dependencies that:
        uses websockets to a message to all the clients that subscribed to the topic broadcast
        exposes the endpoint for sending the message on broadcast-message that:
            accepts a payload of MessageDTO that has 2 properties:
                type
                message
        has a mocked frontend that:
            connects using SockJS
            prints on screen the MessageDTO

    the output in the browser will be similar to the picture output.PNG

    send a message to the subscribed client using Postman
 */

package co.develhope.Servizi.Web.Socket1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiziWebSocket01Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiziWebSocket01Application.class, args);
	}

}
