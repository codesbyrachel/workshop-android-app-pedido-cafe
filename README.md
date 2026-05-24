# ☕ Workshop Android — App de Café

Projeto criado para o workshop **"Criando seu Primeiro App Android"**.

O objetivo é ensinar os fundamentos do Android moderno com Jetpack Compose através da evolução do app em diferentes branches.

---

## 🌿 Estrutura das Branches

Cada branch representa uma evolução do projeto.

```text
main
└── Primeira tela com Compose

step-2-layout
└── Interface completa do app

step-3-state
└── Introdução ao State e reatividade

step-4-final
└── Fluxo completo do pedido
```

### Como navegar entre as branches

```bash
git checkout nome-da-branch
```

Exemplo:

```bash
git checkout step-3-state
```

### O que existe em cada branch

| Branch | Conteúdo |
|---|---|
| `main` | Estrutura inicial do projeto e primeiros componentes Compose |
| `step-2-layout` | Construção completa da interface do app |
| `step-3-state` | Introdução ao State, interações e reatividade |
| `step-4-final` | Confirmação de pedido e experiência final do app |

---

## ✨ Funcionalidades

- Seleção de tamanho do café
- Campo de nome personalizado
- Validação do pedido
- Feedback visual ao finalizar pedido
- Interface reativa com State

---

## 🧩 Componentes utilizados

- Column
- Row
- Text
- Image
- Button
- Card
- Spacer
- OutlinedTextField
- MaterialTheme
- State (`remember` + `mutableStateOf`)

---

## 🛠️ Tecnologias

- Kotlin
- Jetpack Compose
- Material 3

---

## ▶️ Executando o projeto

```bash
git clone <url-do-repositorio>
```

Abra o projeto no Android Studio e execute em um emulador ou dispositivo físico.

---
