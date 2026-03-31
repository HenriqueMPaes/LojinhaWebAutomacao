# 🌐 Automação de Testes Web - Lojinha

Projeto de automação de testes web desenvolvido em **Java**, com foco na validação de funcionalidades da aplicação _Lojinha_ através da interface do usuário (UI).

---

## 🎯 Objetivo

Este projeto tem como objetivo demonstrar habilidades em **automação de testes web**, garantindo a qualidade da aplicação por meio da validação de fluxos reais do usuário em ambiente web.

O foco está em:

- Testes end-to-end (E2E)
- Validação de interface (UI)
- Testes de comportamento do sistema
- Garantia de qualidade da experiência do usuário

---

## 🚀 Tecnologias utilizadas

- ☕ Java
- 🌐 Selenium WebDriver
- 🧪 Framework de testes (JUnit)
- 🌍 Navegadores (Chrome, Edge, etc.)
- 📦 Maven

---

## 🧱 Arquitetura do projeto

O projeto segue o padrão **Page Object Model (POM)**, garantindo organização e manutenção facilitada:

```
src/
├── test/
│   ├── java/
│   │   ├── tests/        # Casos de teste (fluxos do usuário)
│   │   ├── pages/        # Page Objects (elementos da interface)
│   │   ├── base/         # Configuração do WebDriver
│   │   └── utils/        # Métodos auxiliares
│
└── resources/
    └── config/           # Configurações (URLs, ambiente, etc.)

```

---

## 🔍 Cenários de teste implementados

Os testes automatizados cobrem os principais fluxos da aplicação web:

- ✅ Cadastro de usuário
- ✅ Login na aplicação
- ✅ Navegação entre páginas
- ✅ Cadastro de produtos
- ✅ Validação de elementos na interface
- ✅ Testes de comportamento do sistema

---

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java 8+
- Maven
- Navegador instalado (Chrome recomendado)
- WebDriver configurado (ChromeDriver, por exemplo)

---

### Passos para execução

```bash
git clone https://github.com/HenriqueMPaes/LojinhaWebAutomacao.git
cd LojinhaWebAutomacao

```

#### Execute os testes:

**Com Maven:**

```bash
mvn clean test

```

---

## 📊 Boas práticas aplicadas

- Uso de Page Object Model (POM)
- Separação de responsabilidades
- Reutilização de código
- Testes independentes e organizados
- Estrutura escalável para novos cenários

---

## 💼 Valor para o portfólio QA

Este projeto demonstra:

- ✔️ Automação de testes web com Selenium
- ✔️ Estruturação de testes E2E
- ✔️ Validação de interface e experiência do usuário
- ✔️ Integração com ferramentas do ecossistema Java
- ✔️ Capacidade de testar aplicações reais

---

## 🔮 Possíveis melhorias

- Execução paralela de testes
- Integração com CI/CD (GitHub Actions) ([GitHub Docs](https://docs.github.com/pt/enterprise-cloud%40latest/admin/concepts/enterprise-fundamentals/automations-in-your-enterprise?utm_source=chatgpt.com "Automações em sua empresa - GitHub Enterprise Cloud Docs"))
- Geração de relatórios (Allure Reports)
- Testes cross-browser
- Integração com cloud (BrowserStack / Sauce Labs)

---

## 🤝 Contato

Caso queira trocar ideias sobre QA, automação ou oportunidades:

- LinkedIn: https://www.linkedin.com/in/henriquepaesprofissional/
- Email: henrique.mpaes@outlook.com

---

## 📄 Licença

Projeto com fins educacionais e de demonstração de portfólio.
