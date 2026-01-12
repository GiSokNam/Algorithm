class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            int index = 0;
            String prev = "";

            while (index < word.length()) {
                boolean matched = false;

                for (String sound : sounds) {
                    if (word.startsWith(sound, index) && !sound.equals(prev)) {
                        index += sound.length();
                        prev = sound;
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    break;
                }
            }

            if (index == word.length()) {
                count++;
            }
        }

        return count;
    }
}