# Projeto de Plataforma de Música com Java

Este é um projeto simples de uma plataforma de música desenvolvido em Java, utilizando conceitos fundamentais de programação orientada a objetos. A plataforma inclui classes para representar áudios, músicas e podcasts, com funcionalidades como reprodução, classificação e contagem de reproduções.

Conceitos de Orientação a Objetos Utilizados
1. Herança:
   O projeto utiliza herança para criar uma hierarquia de classes. A classe Audio é a classe base, representando características comuns a músicas e podcasts. As classes Musica e Podcast estendem a classe Audio, herdando seus atributos e métodos, e adicionando características específicas.

2. Encapsulamento:
   O encapsulamento é aplicado com o uso de atributos privados nas classes. Métodos públicos são fornecidos para acessar e manipular esses atributos de forma controlada, mantendo a integridade dos dados.

3. Polimorfismo:
   O projeto demonstra polimorfismo ao permitir que objetos de diferentes classes (músicas e podcasts) sejam tratados de forma uniforme através da referência da classe base Audio. Isso facilita o tratamento homogêneo de objetos distintos.