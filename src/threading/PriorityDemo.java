package threading;

class PriorityDemo extends Thread {
	 public void run() {
	 System.out.println(Thread.currentThread().getName() + " Priority: " +
	Thread.currentThread().getPriority());
	 }
	 public static void main(String[] args) {
	 PriorityDemo t1 = new PriorityDemo();
	 PriorityDemo t2 = new PriorityDemo();
	 PriorityDemo t3 = new PriorityDemo();
	 t1.setPriority(Thread.MIN_PRIORITY); 
	 t2.setPriority(Thread.NORM_PRIORITY); 
	 t3.setPriority(Thread.MAX_PRIORITY); 
	 t1.setName("Low");
	 t2.setName("Medium");
	 t3.setName("High");
	 t1.start(); t2.start(); t3.start();
	 }
	}

