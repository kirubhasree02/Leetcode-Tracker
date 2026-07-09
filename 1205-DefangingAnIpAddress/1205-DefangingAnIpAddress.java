// Last updated: 09/07/2026, 15:08:20
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}