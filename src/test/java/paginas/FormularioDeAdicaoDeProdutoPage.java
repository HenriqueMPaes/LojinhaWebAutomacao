package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FormularioDeAdicaoDeProdutoPage {
    private WebDriver navegador;

    public FormularioDeAdicaoDeProdutoPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public FormularioDeAdicaoDeProdutoPage informarONomeDoProduto(String nomeProduto) {
        navegador.findElement(By.id("produtonome")).sendKeys(nomeProduto);
        return this;
    }

    public FormularioDeAdicaoDeProdutoPage informarOValorDoProduto(String valorProduto) {
        navegador.findElement(By.name("produtovalor")).sendKeys(valorProduto);
        return this;
    }

    public FormularioDeAdicaoDeProdutoPage informarAsCoresDoProduto(String coresProduto) {
        navegador.findElement(By.id("produtocores")).sendKeys(coresProduto);
        return this;
    }

    public ListaDeProdutosPage submeterFormularioDeAdicaoDeProduto(){
        navegador.findElement(By.id("btn-salvar")).click();

        return new ListaDeProdutosPage(navegador);
    }

    public FormularioDeEdicaoDeProdutoPage submeterFormularioDeEdicaoDeProduto(){
        navegador.findElement(By.id("btn-salvar")).click();

        return new FormularioDeEdicaoDeProdutoPage(navegador);
    }
}
