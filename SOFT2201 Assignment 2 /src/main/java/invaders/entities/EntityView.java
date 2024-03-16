WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package invaders.entities;

import javafx.scene.Node;
import invaders.rendering.Renderable;

public interface EntityView {
    void update(double xViewportOffset, double yViewportOffset);

    boolean matchesEntity(Renderable entity);

    void markForDelete();

    Node getNode();

    boolean isMarkedForDelete();
}
