package shabab477.hibernate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author shabab
 * @since 5/22/18
 */
@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
