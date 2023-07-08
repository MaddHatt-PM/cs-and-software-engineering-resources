Needed to use both middle node finder (fast/slow pointer) and a reversal on that point.
Fortunately the reverse function from reverse-linked-list made this problem more straightforward.
Improvements came from removing a boolean check with the middle finder and adding an extra condition for `fast.next`. This cuts the while loop in half.