class Solution {
    public boolean isValid(String s) {
        List<Character> opening = Arrays.asList('(', '[', '{');
        List<Character> closing = Arrays.asList(')', ']', '}');
        Map<Character, Character> matching = new HashMap<>();
        matching.put(')', '(');
        matching.put(']', '[');
        matching.put('}', '{');
        Stack<Character> order = new Stack<>();

        for (char c : s.toCharArray()){
            if (opening.contains(c)){
                order.push(c);
            }

            if (closing.contains(c)){
                if(order.isEmpty()){
                    return false;
                }
                if(matching.get(c) == order.peek()){
                    order.pop();
                } else {
                    return false;
                }
            }
        }

        return order.isEmpty();
    }
}
