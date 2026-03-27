package src.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    class Subscriber {
        String name;

        public Subscriber(String name) {
            this.name = name;
        }

        void Update(String video) {
            System.out.println(name + "Received Notification " + video);
        }
    }

    class channel {
        private List<Subscriber> subscribers = new ArrayList<>();

        public void subscribers(Subscriber sub) {
            subscribers.add(sub);
        }

        public void notifySubscriber(String video) {
            for (Subscriber s : subscribers) {
                s.Update(video);
            }
        }
    }
}
