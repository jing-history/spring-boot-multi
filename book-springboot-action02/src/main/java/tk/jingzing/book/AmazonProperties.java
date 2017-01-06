package tk.jingzing.book;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wangyunjing on 2017/1/6.
 */
@Component
@ConfigurationProperties("amazon")
public class AmazonProperties {

    private String associateId;
    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }
    public String getAssociateId() {
        return associateId;
    }
}
