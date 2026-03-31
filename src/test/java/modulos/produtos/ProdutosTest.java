package modulos.produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.FormularioDeAdicaoDeProdutoPage;
import paginas.ListaDeProdutosPage;
import paginas.LoginPage;

import java.time.Duration;

@DisplayName("Testes Web do Modulo de Produtos")
public class ProdutosTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        //abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
        this.navegador  = new ChromeDriver();

        //vou maximizar a tela
        this.navegador.manage().window().maximize();

        //vou definir um tempo de espera padrao de 5 segudos
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //navegar para a pag da lojinha web
        this.navegador.get("http://165.227.93.41/lojinha-web/v2");
    }

    @Test
    @DisplayName("Nao e permitido registrar um produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero(){

        //fazer login e ir para a tela de registro de produto
        String mensagemApresentada =  new LoginPage(navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarONomeDoProduto("Mac Book Pro")
                .informarOValorDoProduto("000")
                .informarAsCoresDoProduto("Preto")
                .submeterFormularioDeAdicaoDeProduto()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @Test
    @DisplayName("Nao e permitido registrar um produto com valor acima de sete mil")
    public void testNaoEPermitidoRegistrarProdutoComValorAcimaDeSeteMil(){

        //fazer login e ir para a tela de registro de produto
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarONomeDoProduto("Play Station 5")
                .informarOValorDoProduto("700001")
                .informarAsCoresDoProduto("Preto, Azul")
                .submeterFormularioDeAdicaoDeProduto()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);
    }

    @Test
    @DisplayName("Permitido adicionar produto com valor entre 0 e 7000")
    public void testEPermitidoRegistrarProdutoComValorDeTresMil(){

        //fazer login e ir para a tela de registro de produto
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarONomeDoProduto("Iphone")
                .informarOValorDoProduto("300000")
                .informarAsCoresDoProduto("Preto, Rosa")
                .submeterFormularioDeEdicaoDeProduto()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Produto adicionado com sucesso", mensagemApresentada);
    }

    @Test
    @DisplayName("Permitido adicionar produto com valor entre 0 e 7000")
    public void testEPermitidoRegistrarProdutoComValorMaiorQueZeroEMenorQueSeteMilEUm(){

        //fazer login e ir para a tela de registro de produto
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarONomeDoProduto("Iphone")
                .informarOValorDoProduto("300000")
                .informarAsCoresDoProduto("Preto, Rosa")
                .submeterFormularioDeEdicaoDeProduto()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Produto adicionado com sucesso", mensagemApresentada);
    }

    @Test
    @DisplayName("Permitido adicionar produto com valor entre 0 e 7000")
    public void testEPermitidoRegistrarProdutoComValorDeSeteMil(){

        //fazer login e ir para a tela de registro de produto
        String mensagemApresentada = new LoginPage(navegador)
                .informarOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioAdicaoNovoProduto()
                .informarONomeDoProduto("Mac Book Pro 2")
                .informarOValorDoProduto("700000")
                .informarAsCoresDoProduto("Branco, Rosa")
                .submeterFormularioDeEdicaoDeProduto()
                .capturarMensagemApresentada();

        Assertions.assertEquals("Produto adicionado com sucesso", mensagemApresentada);
    }

    @AfterEach
    public void afterEach() {
        //Vou fechar o navegador
        navegador.quit();
    }
}
