package uz.jl;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 15:13 (Friday)
 * @project: lombok_test
 */
public class EAHCTest {

    public static void main(String[] args) {
        /*
        int tempMemAddress = System.identityHashCode(card);
        System.out.println(tempMemAddress);


        Long a = new Long(12L);
        Long b = new Long(12L);
        String username = new String("john");
        String blackMan = new String("john");

        System.out.println("(a == b) = " + (a.equals(b)));
        System.out.println("(username == blackMan) = " + (username.equals(blackMan)));
        */

        Card card1 = new Card("86009090", "09/26");
        Card card2 = new Card("86009090", "09/27");
//        System.out.println("card1 = " + card1);
//        System.out.println("card2 = " + card2);
//        System.out.println("(card1 == card2) = " + (card1.equals(card2)));

        Set<Card> cards = new HashSet<>() {{
            add(card1);
            add(card2);
        }};

        System.out.println("cards.size() = " + cards.size());

    }


}

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "pan")
class Card {
    private String pan;
    private String expiry;


//    @Override
//    public int hashCode() {
////        return Objects.hashCode(pan) + Objects.hashCode(expiry);
//        return Objects.hash(pan, expiry);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Card o))
//            return false;
//        return this.getPan().equals(o.getPan()) &&
//                this.getExpiry().equals(o.getExpiry());
////        if (this.getPan().equals(o.getPan()) &&
////                this.getExpiry().equals(o.getExpiry()))
////            return true;
////
////        return false;
//    }
}
