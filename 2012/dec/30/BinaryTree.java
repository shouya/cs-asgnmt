

class BinaryTreeNode<T extends Comparable>
{
     public BinaryTreeNode(T value,
                           BinaryTreeNode<T> leftchild,
                           BinaryTreeNode<T> rightchild)
     {
          this.value = value;
          this.lchild = leftchild;
          this.rchild = rightchild;
     }

     /* public accessors */
     public void set_value(T new_value)
     {
          this.value = new_value;
     }
     public T value()
     {
          return this.value;
     }

     public void set_left_child(T leftchild)
     {
          this.lchild = leftchild;
     }
     public T left_child()
     {
          return this.leftchild;
     }

     public void set_right_child(T rightchild)
     {
          this.rchild = rightchild;
     }
     public T right_child()
     {
          return this.rightchild;
     }

     /**/
     public void insert(T value)
     {
          int comp = value.comparableTo(this.value);
          if (comp < 0) {
               lchild.insert(T);
          }
     }

     /* data members */
     private T value;
     private BinaryTreeNode<T> lchild, rchild;
}

public class BinaryTree<T>
{
     BinaryTreeNode<T> root;

     void insert(T value)
     {
          if (root == null) {
               root = value;
               return;
          }

          BinaryTreeNode<T> pointer = root;

          while (true) {
               int cmp = pointer.value().comparableTo(value);
               if (cmp > 0) {
                    
               }
          }
     }
}
