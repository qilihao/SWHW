# Linked List Pair Swapper

This Python module includes a solution for swapping every two adjacent nodes in a singly linked list. The functionality provided does not alter the values within the nodes; instead, it modifies the links between nodes to achieve the desired swapping. This is especially useful for manipulating data structures where node reordering is necessary without changing the node data.

## Features

- **Swap Adjacent Pairs**: Efficiently swaps every two adjacent nodes in the linked list without altering the node values.
- **Conversion Utilities**: Provides helper functions to convert a Python list to a linked list and vice versa, making it easy to test and integrate.

## Installation

This script does not require any external libraries and can be run in any standard Python environment.

## Usage

To utilize this module, create an instance of the `Solution` class and use its methods to manipulate linked lists. Here is a brief example demonstrating how to use this module:

```python
from solution import Solution, ListNode

# Create an instance of the Solution class
solution = Solution()

# Convert a list to a linked list
input_list = [1, 2, 3, 4]
linked_list = solution.to_linked_list(input_list)

# Swap pairs in the linked list
swapped_list_head = solution.swapPairs(linked_list)

# Convert the swapped linked list back to a Python list
output_list = solution.to_list(swapped_list_head)
print(output_list)  # Outputs [2, 1, 4, 3]
