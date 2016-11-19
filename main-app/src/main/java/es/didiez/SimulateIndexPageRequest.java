/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.didiez;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.IOException;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author diego
 */
@Component
public class SimulateIndexPageRequest implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        try {
            Thread.sleep(1000);
            WebClient webClient = new WebClient();
            HtmlPage page = webClient.getPage("http://localhost:8080/index.xhtml");
            System.out.println(page.asText());
        } catch (InterruptedException | IOException | FailingHttpStatusCodeException ex) {
            throw new RuntimeException(ex);
        }
    }
}
