package isabelcalzadilla.ioc.fragmentsactivity.content;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static final List<Author> PHILOSOPHERS = new ArrayList<>();

    public static final String KEY_VALUE = "key_value";

    private static final int COUNTER = 10;

    // CLASE ESTÁTICA PARA SER INVOCADA

    public static class Author {

        public final String author_name;
        public final String author_work;

        private Author(String author_name, String author_work){
            this.author_name = author_name;
            this.author_work = author_work;
        }
    }

    // MÉTODO DE ACCESO

    // ADHIRE UN VALOR AL LIST
    private static void newValue(Author author){
        PHILOSOPHERS.add(author);
    }

    static {
        for(int i = 0; i < COUNTER; i++){
            newValue(addNewAuthor(i));
        }
    }

    // SWITCH PARA CAPTURAR EL INDICE Y RETORNAR EL FRAGMENT DETAIL
    private static Author addNewAuthor(int index) {
        String new_author_name;
        String new_author_work;

        switch (index){
            case 0 :
                new_author_name = "1. Aristotles";
                new_author_work = "\t\t\t\t\t\t1. Aristotles\n\n\nAristotle, one of the most famous Greek philosophers, was also a polymath who lived in Ancient Greece in 384-322 BC. He was taught by another famous philosopher, Plato. \n\nAristotle is often referred to as the first scientist in history. He is responsible for at least 200 treatises, and approximately 31 of those are still in circulation today. His work focused on disciplines, philosophy of mind through ethics, political theory, aesthetics, and rhetoric, along with non-philosophical works about empirical biology; he was very well known for his theories on plant and animal observation, which were very detailed. \n\nToday, he is most remembered for the first logic, or systematic treatment of principles of correct reasoning, along with identifying the three main methods of rhetoric: ethos (ethics), pathos (emotions), and logos (logic). He also developed the theory of deduction, or as we call it today, syllogism.";
                break;
            case 1 :
                new_author_name = "2. Arthur Schopenhauer";
                new_author_work = "\t\t\t\t\t\t2. Arthur Schopenhauer\n\n\nArthur Schopenhauer was among the first 19th century philosophers to contend that at its core, the universe is not a rational place. Inspired by Plato and Kant, both of whom regarded the world as being more amenable to reason, Schopenhauer developed their philosophies into an instinct-recognizing and ultimately ascetic outlook, emphasizing that in the face of a world filled with endless strife, we ought to minimize our natural desires for the sake of achieving a more tranquil frame of mind and a disposition towards universal beneficence.\n\n Often considered to be a thoroughgoing pessimist, Schopenhauer in fact advocated ways – via artistic, moral and ascetic forms of awareness – to overcome a frustration-filled and fundamentally painful human condition. Since his death in 1860, his philosophy has had a special attraction for those who wonder about life’s meaning, along with those engaged in music, literature, and the visual arts.";
                break;
            case 2 :
                new_author_name = "3. Confucius";
                new_author_work = "\t\t\t\t\t\t3. Confucius\n\n\nMaster Kong Qiu, as his name translates from Chinese, lived from 551 to 479 BC and remains the most important single philosopher in Eastern history. He espoused significant principles of ethics and politics in a time when the Greeks were espousing the same things. We think of democracy as a Greek invention, a Western idea, but Confucius wrote in his Analects that “the best government is one that rules through ‘rites’ and the people’s natural morality, rather than by using bribery and coercion.” This may sound obvious to us today, but he wrote it in the early 500s to late 400s BC. It is the same principle of democracy that the Greeks argued for and developed: the people’s morality is in charge, therefore, rule by the people.\n\nConfucius defended the idea of an Emperor but also advocated limitations to the emperor’s power. The emperor must be honest, and his subjects must respect him, but he must also deserve that respect. If he makes a mistake, his subjects must offer suggestions to correct him, and he must consider them. Any ruler who acted contrary to these principles was a tyrant and thus a thief more than a ruler.";
                break;
            case 3 :
                new_author_name = "4. Epicurus";
                new_author_work = "\t\t\t\t\t\t4. Epicurus\n\n\nEpicurus has gotten a bit of an unfair reputation over the centuries as a teacher of self-indulgence and excess delight. He was soundly criticized by many Christian polemicists (those who make war against all thought but Christian thought). This occurred especially during the Middle Ages because he was thought to be an atheist, whose principles for a happy life were passed down through his famous set of statements: 'Don’t fear god; don’t worry about death; what is good is easy to get; what is terrible is easy to endure.'\n\nHe advocated the principle of refusing belief in anything that was not tangible, including any god. Such intangible things he considered preconceived notions, which could be manipulated. You may think of Epicureanism as “no matter what happens, enjoy life because you only get one and it doesn’t last long.” Epicurus’s idea of living happily centered on the just treatment of others, avoidance of pain, and living in such a way as to please oneself, but not to overindulge in anything.";
                break;
            case 4 :
                new_author_name = "5. Friedrich Nietzsche";
                new_author_work = "\t\t\t\t\t\t5. Friedrich Nietzsche\n\n\nFriedrich Nietzsche was a poet, cultural critic, and philosopher, as well as possessor of among the most gifted minds in human history. The German thinker’s system of ideas would have a profound impact on the Western World, contributing deeply to intellectual discourse both during and after his life. Writing on an enormous breadth of subjects, from history, religion and science to art, culture and the tragedies of Greek and Roman Antiquity, Nietzsche wrote with savage wit and a love of irony.\n\nHe used these forces to pen deconstructive examinations of truth, Christian morality, and the impact of social constructs on our formulation of moral values. Also essential to Nietzshe’s writing is articulation of the crisis of nihilism, the basic idea that all things lack meaning, including life itself. This idea in particular would remain an important component of the existentialist and surrealist movements that followed.";
                break;
            case 5 :
                new_author_name = "6. Inmanuel Kant";
                new_author_work = "\t\t\t\t\t\t6. Inmanuel Kant\n\n\nImmanuel Kant is a well-known modern philosopher that lived from 1724-1804 near the Baltic Sea and is remembered for his Critiques of Practical Reason, Pure Reason, and the Power of Judgement. \n\nHe preached that measuring whether actions are right or wrong depends on whether or not we have fulfilled our duty rather than what the consequences of our actions are. By using his fundamental law of morality, he concludes that moral reason overrides any other sort of reason.";
                break;
            case 6 :
                new_author_name = "7. John Locke";
                new_author_work = "\t\t\t\t\t\t7. John Locke\n\n\nJohn Locke, who lived in Europe in the 17th century, was an Oxford academic who also researched medicine. He is best known for his work regarding Enlightenment, along with his developments in liberalism. \n\nLocke strongly believed in all persons’ rights to life, liberty, and property, and refuted the divine right of kings. He also believed that if a ruler does not adhere to individuals’ rights, the people had the right to remove the king by force. First and foremost, he believed that a government’s duty is to exist for the people.";
                break;
            case 7 :
                new_author_name = "8. Lao-Tzu";
                new_author_work = "\t\t\t\t\t\t8. Lao-Tzu\n\n\nLao-Tzu, another top ten philosopher, developed a theory that is strongly connected to Taoism. He authored the main book on Taoism around 500 BCE in Ancient China. Taoism focuses on the balance of animals and humans and how they should coexist in the universe.\n\nHe also believed in spiritual immortality, in which your soul does not die, but instead, becomes one with the universe after death. \n\nThe chi (or qi) is the energy that guides the universe, and he believed that we should exist in harmony.";
                break;
            case 8 :
                new_author_name = "9. Plato";
                new_author_work = "\t\t\t\t\t\t9. Plato\n\n\nPlato lived from c. 428 to c. 348 BC and founded the Western world’s first school of higher education, the Academy of Athens. Almost all of Western philosophy can be traced back to Plato, who was taught by Socrates and preserved through his own writings some of Socrates’s ideas. If Socrates wrote anything down, it has not survived directly. Plato and Xenophon, another of his students, recounted many of his teachings, as did the playwright Aristophanes. \n\nOne of Plato’s most famous quotations concerns politics, “Until philosophers rule as kings or those who are now called kings and leading men genuinely and adequately philosophize, that is, until political power and philosophy entirely coincide, while the many natures who at present pursue either one exclusively are forcibly prevented from doing so, cities will have no rest from evils…nor, I think, will the human race.” He means that any person(s) in control of a nation, city, or city-state must be wise and, if they are not, they are ineffectual rulers. It is only through philosophy that the world can be free of evils. Plato’s preferred government was one of benevolent aristocrats, those born of nobility, who are well educated and good, who help the common people to live better lives. He argued against democracy’s proper rule by the people themselves since, in his view, a democracy had murdered his teacher, Socrates.";
                break;
            case 9 :
                new_author_name = "10. Rene Descartes";
                new_author_work = "\t\t\t\t\t\t10. Rene Descartes\n\n\n4 Rene Descartes lived from 1596 to 1650, and today he is referred to as the “Father of Modern Philosophy.” He created analytical geometry, based on his now immortal Cartesian coordinate system, immortal in the sense that we are all taught it in school and that it is still perfectly up-to-date in almost all branches of mathematics. Analytical geometry is the study of geometry using algebra and the Cartesian coordinate system. He discovered the laws of refraction and reflection. He also invented the superscript notation still used today to indicate the powers of exponents.\n\nHe advocated dualism, which is basically defined as the power of the mind over the body: strength is derived by ignoring the weaknesses of the human physique and relying on the infinite power of the human mind. Descartes’s most famous statement, now practically the motto of existentialism: “Je pense donc je suis;” “Cogito, ergo sum;” or “I think, therefore I am.” This is not meant to prove the existence of one’s body. Quite the opposite, it is meant to prove the existence of one’s mind. He rejected perception as unreliable and considered deduction the only reliable method for examining, proving, and disproving anything.";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }

        return new Author(new_author_name, new_author_work);
    }
}
