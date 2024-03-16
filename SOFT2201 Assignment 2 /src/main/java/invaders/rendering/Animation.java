WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package invaders.rendering;

import javafx.scene.image.Image;

public interface Animation {
    public String getName();
    public Image getCurrentFrame();
    public void next();
}
