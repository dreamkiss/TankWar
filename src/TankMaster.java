import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ProjectName: TankWar
 * @Package: PACKAGE_NAME
 * @ClassName: TankMaster
 * @Description: java类作用描述
 * @Author: faxinChen
 * @CreateDate: 2019/11/10 18:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/11/10 18:35
 */
public class TankMaster {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setSize(1000, 1000);
        fr.setTitle("Tank War");
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
