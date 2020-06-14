package com.example.xurebinhaquiz;

import java.util.ArrayList;
import java.util.List;

public class Questions {

    private int id;
    private String pergunta;

    List<Questions> questionsList = new ArrayList<Questions>(){
        {
            add(new Questions(1,"Sou bastante autêntico e digo aquilo que penso."));
            add(new Questions(2,"Sou introspectivo, penso muito antes de me expor."));
            add(new Questions(3,"Questões intelectuais profundas não me interessam."));
            add(new Questions(4,"Sou persistente e não desisto até atingir meus objetivos."));
            add(new Questions(5,"As pessoas podem contar comigo. Sou bastante estável em minhas ações. "));
            add(new Questions(6,"Gosto de trabalhar com materiais, com as mãos, objetos e instrumentos. "));
            add(new Questions(7,"Consigo aguentar por um bom tempo uma atividade física ou intelectual. "));
            add(new Questions(8,"Dou muito valor para o dinheiro."));
            add(new Questions(9,"Sei utilizar instrumentos e aparelhos eletrônicos."));
            add(new Questions(10,"Aceito bem regras, limites, ordens e o contexto no qual vivo."));

            add(new Questions(11,"Gosto de observar, analisar e entender o modo como as coisas, a natureza ou as pessoas funcionam. "));
            add(new Questions(12,"Não sou muito impulsivo, penso antes de agir."));
            add(new Questions(13,"Áreas como Matemática e Ciências me atraem. Gosto de estudar um assunto a fundo."));
            add(new Questions(14,"Tenho facilidade para aprender."));
            add(new Questions(15,"Sou racional para tomar uma decisão ou para decidir o melhor caminho a seguir."));
            add(new Questions(16,"Sou muito organizado e detalhista."));
            add(new Questions(17,"Sou capaz de dar respostas precisas sobre datas, valores e descrever bem determinada situação do passado."));
            add(new Questions(18,"Tenho um grande senso crítico. As coisas sempre podem ser melhoradas."));
            add(new Questions(19,"Gosto de tomar minhas próprias decisões, mesmo que sejam diferentes do pensamento da maioria. "));
            add(new Questions(20,"Tenho boa habilidade lógica ou matemática."));

            add(new Questions(21,"É difícil para mim aceitar regras, limites e algo que me é imposto."));
            add(new Questions(22,"Para mim, é fácil viver em um ambiente desorganizado e fazer as coisas sem uma lógica. "));
            add(new Questions(23,"Sou muito sensível. Acredito que possamos construir um mundo melhor."));
            add(new Questions(24,"Sou uma pessoa idealista. Acredito que possamos construir um mundo melhor."));
            add(new Questions(25,"Gosto de criar, inventar, idealizar e fantasiar."));
            add(new Questions(26,"Gosto de causar impacto, provocando, entretendo, seduzindo, encantando as pessoas. "));
            add(new Questions(27,"Gosto de descobrir novas possibilidades para as coisas e situações da vida."));
            add(new Questions(28,"Muitas vezes, não penso muito antes de tomar uma decisão, nem meço as consequências."));
            add(new Questions(29,"Gosto de me expressar, de representar ou de me mostrar em público. "));
            add(new Questions(30,"Responsabilizo-me por minhas atitudes e decisões."));

            add(new Questions(31,"Gosto de liderar, de organizar ou de mobilizar um grupo em torno de uma causa ou ação. "));
            add(new Questions(32,"Gosto de ajudar e colaborar com os outros. Sou leal e benevolente. "));
            add(new Questions(33,"Uso a emoção e a sensibilidade para tomar decisões."));
            add(new Questions(34,"Em geral, sou uma pessoa agradável e fácil de lidar."));
            add(new Questions(35,"Sou idealista e quero mais da vida."));
            add(new Questions(36,"Questões éticas, de justiça ou bem-estar comum são importantes para mim. "));
            add(new Questions(37,"Sou responsável. Podem contar comigo porque sempre correspondo ao esperado."));
            add(new Questions(38,"Costumo me dedicar a pessoas ou a causas, “vestindo a camisa” de uma entidade, de um grupo ou de um clube que eu acredite."));
            add(new Questions(39,"No geral, me relaciono bem com os outros. Tenho facilidade para dialogar."));
            add(new Questions(40,"Gosto de ajudar, ensinar, curar e, de alguma forma, quero ser importante para os outros."));

            add(new Questions(41,"Sou ﬁrme e conﬁante em minhas decisões e não preciso de palpites. "));
            add(new Questions(42,"Muitas vezes consigo convencer as pessoas sobre determinado ponto de vista. "));
            add(new Questions(43,"Sou uma pessoa motivada, incentivada, otimista."));
            add(new Questions(44,"Falo muito. Não desisto facilmente de uma argumentação."));
            add(new Questions(45,"Dou muito valor aos bens materiais. Gosto de comprar e, às vezes, até de demonstrar aos outros minhas conquistas, meus bens materiais, minha sabedoria e meus talentos."));
            add(new Questions(46,"Tomo decisões rapidamente. Ajo sem reﬂetir muito. Chego a ser impulsivo."));
            add(new Questions(47,"Gosto de estar no meio das pessoas, especialmente para mostrar a elas o modo como penso."));
            add(new Questions(48,"Gosto muito de aventuras, de me arriscar e de desaﬁos."));
            add(new Questions(49,"Estou sempre procurando novas oportunidades, novos caminhos a seguir."));
            add(new Questions(50,"Preﬁro ser o dono de um negócio do que trabalhar para alguém. "));

            add(new Questions(51,"Aceito bem as regras e o contexto no qual vivo. Gosto de limites claros."));
            add(new Questions(52,"Sou introvertido, me resguardo e não me exponho muito."));
            add(new Questions(53,"Cuido de minhas coisas e gosto de conservá-las."));
            add(new Questions(54,"Sou bem calmo e tenho bom equilíbrio emocional."));
            add(new Questions(55,"Preﬁro ter um plano de ação, uma rotina deﬁnida de trabalho."));
            add(new Questions(56,"Sou um tipo de pessoa estável, conﬁável, adequada à realidade."));
            add(new Questions(57,"Respeito a ética, guardo segredos, cumpro com o combinado."));
            add(new Questions(58,"Sou muito organizado e detalhista nas coisas. Eﬁcácia é muito importante para mim."));
            add(new Questions(59,"Eu vou até o ﬁm em meus objetivos. Não desisto até atingi-los."));
            add(new Questions(60,"Gosto de satisfazer os outros em relação àquilo que me pedem."));

        }

    };
    
        public Questions(Integer id, String pergunta){

            this.id = id;
            this.pergunta = pergunta;

        }

        public String getPergunta(){ return this.pergunta; }

    }


