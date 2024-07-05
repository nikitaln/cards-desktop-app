

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainForm {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel leftPanelLabel;
    private JLabel rightPanelLabel;
    private JList listUsers;
    private JTextField surnameField;
    private JLabel surnameLabel;
    private JTree tree1;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel patronymicLabel;
    private JTextField patronymicField;
    private JLabel cardInfoLabel;
    private JLabel cardNumberLabel;
    private JTextField cardNumberField;
    private JLabel cardCodeLabel;
    private JTextField cardCodeField;
    private JButton добавитьПользователяButton;
    private JLabel departmentLabel;
    private JTextField departmentField;
    private JLabel dateLabel;
    private JTextField textField1;
    private JPanel rightPanel2;
    private JLabel addUserLabel;
    private JTextField addSurnameField;
    private JTextField addNameField;
    private JTextField addPatronymicField;
    private JTextField addCardNumberField;
    private JTextField addCardCodeField;
    private JLabel addSurnameLabel;
    private JLabel addNameLabel;
    private JLabel addPatronymicLabel;
    private JLabel addCardsInfoLabel;
    private JLabel addNumberCardLabel;
    private JLabel addCardCodeLabel;
    private JButton buttonSaveUser;
    private JLabel addDepartmentLabel;
    private JTextField addDepartmentField;
    private JPanel thirdPanel;

    private JPopupMenu jpm;


    public MainForm() {
        rightPanel2.setVisible(false);

        String[] names = {"Никита", "Иван"};

        DefaultMutableTreeNode allDepartments = new DefaultMutableTreeNode("Отделы ГлавАПУ");

        DefaultMutableTreeNode citDep = new DefaultMutableTreeNode("ЦИТ");
        citDep.add(new DefaultMutableTreeNode("Иванов Иван Иванович"));
        citDep.add(new DefaultMutableTreeNode("Максим"));

        DefaultMutableTreeNode mkpDep = new DefaultMutableTreeNode("МКП");
        mkpDep.add(new DefaultMutableTreeNode("Никита"));
        mkpDep.add(new DefaultMutableTreeNode("Андрей"));

        allDepartments.add(citDep);
        allDepartments.add(mkpDep);

        DefaultTreeModel model = (DefaultTreeModel) tree1.getModel();
        model.setRoot(allDepartments);
        tree1.setModel(model);


        jpm = new JPopupMenu();
        JMenuItem jmi = new JMenuItem("Добавить пользователя");


        tree1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


                String department = tree1.getLastSelectedPathComponent().toString();

                if (!department.equals("ЦИТ") && !department.equals("МКП") && !department.equals("Отделы ГлавАПУ")) {

                    System.out.println(department);
                    surnameField.setText(department);
                    TreePath path = new TreePath(mkpDep.getPath());
                    tree1.collapsePath(path);

                    TreePath path1 = new TreePath(citDep.getPath());
                    tree1.collapsePath(path1);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

                System.out.println("test0");

                String department = tree1.getLastSelectedPathComponent().toString();

                System.out.println("test1 " + e.getButton());

                if (e.getButton() == 3) {

                    if (department.equals("ЦИТ")) {
                        System.out.println("test2 " + "ЦИТ");
                        jpm.add(jmi);
                        jpm.show(e.getComponent(), e.getX(), e.getY());
                        jmi.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.out.println("Press context menu item");
                                rightPanel.setVisible(false);
                                rightPanel2.setVisible(true);
                                addDepartmentField.setText("ЦИТ");
                            }
                        });
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



        buttonSaveUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightPanel2.setVisible(false);
                rightPanel.setVisible(true);
            }
        });









        //----------------------------------------------------------------------------------------------------------------------------

//        listUsers.setListData(names);
//
//        listUsers.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println("Клик мышкой по объекту, можно выбрать кол-во кликов");
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println("Нажатие мышкой на объекту, нельзя выбрать кол-во нажатий");
//                System.out.println(listUsers.getSelectedValue());
//                surnameField.setText(listUsers.getSelectedValue().toString());
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                System.out.println("Наведение мышки на объект");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });

    }



    public JPanel getMainPanel() {
        return mainPanel;
    }
}
