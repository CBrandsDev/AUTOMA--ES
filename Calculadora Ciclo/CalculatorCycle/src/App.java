import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        // criação da janela
        JFrame frame = new JFrame("Serase tá ovulando ou não?");

        // tamanho da janela
        frame.setSize(500, 200);

        // ação padrão ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criando o painel para conter o componente de texto
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // Criando um componente de texto
        JLabel label = new JLabel("oi mozinho, to fazendo o negocio pra voce aqui meu anjo");

        // alinhando o texto no centro
        label.setHorizontalAlignment((SwingConstants.CENTER));

        // adicionando o texto ao painel
        panel.add(label);

        // Adicionando o componente de texto a janela
        frame.getContentPane().add(panel);

        // atualizando janela
        frame.revalidate();

        // deixando a janela visivel
        frame.setVisible(true);
    }
}