package carRacing;

import java.util.Random;

import static java.util.Objects.isNull;

public class Car implements MoveAble {
        private static final Random random = new Random();
        private String name;
        private int distance;

        public Car(String name, int distance) {
            if (isNull(name) || name.equals(" ")) {
                throw new IllegalArgumentException("[ERROR] 이름값이 올바르지 않습니다.");
            }
            if (name.length() > 5) {
                throw new IllegalArgumentException("[ERROR] 자동차이름은 5글자 이내로 입력하세요.");
            }
            if (distance < 0) {
                throw new IllegalArgumentException("[ERROR] 이동값이 올바르지 않습니다.");
            }
            this.name = name;
            this.distance = distance;
        }

        public String name() {
            return name;
        }

        public int distance() {
            return distance;
        }

        @Override
        public void move() {
            int randomNumber = random.nextInt(10);
            if (randomNumber >= 4) {
                this.distance++;
            }
        }

        public boolean equalDistance(int distance) {
            return this.distance == distance;
        }
}
