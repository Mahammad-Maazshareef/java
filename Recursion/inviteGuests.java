public class inviteGuests {
    public static int invitingGuests(int n){
        if (n<=1){
            return 1;
        }
        // inviting single
        int single = invitingGuests(n-1);
        // inviting as a pair
        int pair = (n-1)*invitingGuests(n-2);
        return single+pair;
    }
    public static void main(String[] args) {
        System.out.println(invitingGuests(4));
    }
}
