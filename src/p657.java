public class p657 {
    /*
    Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
     */

    public boolean judgeCircle(String moves) {

        int[] loc = new int[2];
        for(int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    loc[0]++;
                    break;

                case 'D':
                    loc[0]--;
                    break;

                case 'L':
                    loc[1]--;
                    break;

                case 'R':
                    loc[1]++;
                    break;
            }
        }

        if(loc[0] == 0 && loc[1] == 0) return true;
        return false;
    }
}
