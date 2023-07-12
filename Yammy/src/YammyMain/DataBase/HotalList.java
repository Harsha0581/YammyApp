package YammyMain.DataBase;
import java.util.HashMap;
import java.util.Objects;
public class HotalList {
	public class HotalName{
		private String Hotal_Name;
		public HotalName(String HotalName) {
			this.Hotal_Name =HotalName;
		}
		public String getHotalName() {
			return this.Hotal_Name;
		}
		@Override
		public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			}
			if(obj == "") {
				return false;
			}
			if(getClass() != obj.getClass()) {
				return false;
			}
			HotalName HN = (HotalName)obj;
			return Hotal_Name.equals(HN.Hotal_Name);
		}
		@Override
		public int hashCode() {
			return Objects.hash(Hotal_Name);
		}
	}
	public class HotalDetails{
		private String HotalId;
		private String Password;
		private String Address;
		private String Number;

		public 	HotalDetails(String hotalId,String Password, String Number
				,String Address) {
			this.HotalId = hotalId;
			this.Password =Password;
			this.Number =Number;
			this.Address =Address;
		}
		public String getAddress() {
			return this.Address;
		}
		public String getHotalId() {
			return this.HotalId;
		}
		public String getPassword() {
			return this.Password;
		}
		public String getNumber() {
			return this.Number;
		}
		@Override
		public int hashCode() {
			return Objects.hash(HotalId,Password,Number, Address);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			HotalDetails HI = (HotalDetails) obj;
			return HotalId.equals(HI.HotalId) && Password.equals(HI.Password) && Number.equals(HI.Number)
					&&Address.equals(HI.Address);
		}
	}
	public HashMap<HotalName, HotalDetails> hotalname = new HashMap<>();
	@Override
	public String toString() {
		return "HotalList [hotalname=" + hotalname + "]";
	}
}








