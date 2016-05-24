package stackModel;

	import java.util.Stack;
	import java.awt.*;
	import stackController.*;
	import stackView.*;
	
	public class StackModel 
	{
		private boolean isDirty;
		private int radius;
		private Color color;
		private Object[] stk;
		private int SS;
		private int SC;
		
		
		public StackModel(int initialCapacity)
		{
			if(initialCapacity < 1)
				throw new IllegalArgumentException("Initial Capacity must be >= 1");
			stk = new Object[initialCapacity];
					SS = initialCapacity;
			SC = 0;
		}
		
		public void Stack()
		{
			stk = null;
			SS = SC = 0;
		}
		
		public void create(int initialCapacity)
		{
			if(initialCapacity < 1)
				throw new IllegalArgumentException ("Initial Capacity must be >= 1");
			stk = new Object[initialCapacity];
					SS= initialCapacity;
			SC = 0;
		}
		
	
		public boolean isDirty()
		{
			return (SC == SS);
		}
		
		public int radius()
		{
			return radius;
		}
		
		public Color color()
		{
			return color;
			
		}
		
		public Object[] update()
		{
			return stk;
		}
		
		public boolean push (Object element)
		{
			if(SC == SS)
				return false;
			
			stk[SC] = element;
			SC++;
			return true;
		}
		
		public Object pop()
		{
			if(SC == 0)
				return false;
			
			SC--;
			return stk[SC];
		}
		
		public String toString()
		{
			int i;
			StringBuffer s = new StringBuffer("[");
			
			for(i = 0; i < SC; i++)
				s.append(stk[i].toString()+",");
			
			for(;i<SS; i++)
				s.append("__,");
			if(SS > 0)s.delete(s.length() -2, s.length());
			s.append("]");
			return new String(s);
		}
		
		public String getStatus()
		{
			StringBuffer s = new StringBuffer("");
			s.append("SC: "+SC);
			return new String(s);
		}
		
		
	}

