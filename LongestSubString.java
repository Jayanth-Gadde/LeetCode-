// Given a string s, find the length of the
// longest substring without duplicate
// characters.

import java.util.HashSet;

public class LongestSubString {
  public static void main(String[] args) {
    String s = "abcabcbb";

    int result = solution(s);
    System.out.println(result);
  }

  private static int solution(String s) {
    HashSet<Character> set = new HashSet<>();
    int left = 0, right, res = 0;
    char c;
    for(right = 0; right < s.length(); right++) {
      while(set.contains(s.charAt(right))) {
        set.remove(s.charAt(left));
        left++;
      }
      set.add(s.charAt(right));
      res = Math.max(res, (right - left) + 1);
    }

    return res;
  }
}

.../files/usr/share/nvim/runtime/lua/vim/lsp/_transport.lua:68: Spawning language server with cmd: `{ "", "--jvm-arg=-javaagent:/data/data/com.termux/files/home/.local/share/nvim/mason/share/jdtls/lombok.jar" }` failed. The language server is either not installed, missing from PATH, or not executable.
