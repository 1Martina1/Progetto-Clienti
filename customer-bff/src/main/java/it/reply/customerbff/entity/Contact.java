package it.reply.customerbff.entity;

public class Contact{
	
		private int id;
		private String type;
		private String val;
		private boolean certified;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

		public boolean isCertified() {
			return certified;
		}

		public void setCertified(boolean certified) {
			this.certified = certified;
		}

}
