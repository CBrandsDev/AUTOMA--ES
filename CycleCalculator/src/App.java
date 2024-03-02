import javax.swing.*;
import java.awt.*;
import java.util.Random;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;

public class App {
    public static void main(String[] args) {
        // Criando uma janela
        JFrame frame = new JFrame("Cycle Calculator");

        // Tamanho da janela
        frame.setSize(500, 200);

        // Configuração de fechar a janela e parar o programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação de painel com layout BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Array de mensagens para a pergunta
        String[] messages = {
            "Qual data o rio de sangue escorreu?",
            "Menina, que dia foi que você menstruou?",
            "Informe o dia que desceu Mona, por favor"
        };

        // Gerando um número aleatório para selecionar a mensagem
        Random random = new Random();
        int randomIndex = random.nextInt(messages.length);
        String randomMessage = messages[randomIndex];

        // Criando um rótulo para a pergunta
        JLabel questionLabel = new JLabel(randomMessage);
        // Alinhando o rótulo ao centro
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Criando um modelo de data
        UtilDateModel model = new UtilDateModel();
        // Criando o seletor de data
        JDatePicker datePicker = new JDatePicker(model);

        // Adicionando o rótulo e o seletor de data ao painel
        panel.add(questionLabel, BorderLayout.NORTH);
        panel.add(datePicker, BorderLayout.CENTER);

        // Adicionando o painel à janela
        frame.getContentPane().add(panel);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}