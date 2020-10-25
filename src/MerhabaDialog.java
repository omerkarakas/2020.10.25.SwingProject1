import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class MerhabaDialog extends JDialog {
    private JPanel contentPane;
    private JButton cancelButton;
    private JButton retryButton;
    private JButton OKButton;
    private JButton fileButton;
    private JPanel JPanelCenter;
    private JTextField textAd;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton kaydetButton;
    private JButton silButton;
    private JLabel lblSoyad;
    private JButton buttonOK;
    private JButton buttonCancel;

    public MerhabaDialog() {
        setContentPane(contentPane);
        setModal(true);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(contentPane,"Merhaba");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

                int result = JOptionPane.showConfirmDialog(contentPane,"İptal etmek istediğinden emin misin?"
                ,"UYARI",JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION)
                    System.out.println("OK basıldı");
                else
                    System.out.println("Kabul etmedi");

            }
        });
        retryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = JOptionPane.showInputDialog(contentPane,"Adın ne?","Soru",JOptionPane.OK_OPTION);
                if (result!=null)
                    System.out.println("İnput : "+ result);
            }
        });
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textAd.getText();
                JOptionPane.showMessageDialog(contentPane,"Merhaba "+name+"!!!");
                lblSoyad.setText(name+"'in soyadi:");
            }
        });
        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAd.setText("");
            }
        });
    }


    public static void main(String[] args) {
        MerhabaDialog dialog = new MerhabaDialog();
        dialog.pack();
        dialog.setSize(400,300);
        dialog.setTitle("Merhaba Swing");
        dialog.setLocation(300,100);
        dialog.setVisible(true);

        System.exit(0);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
