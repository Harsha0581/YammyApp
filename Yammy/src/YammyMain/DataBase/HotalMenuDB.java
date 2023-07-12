package YammyMain.DataBase;
import java.util.Objects;
import java.util.HashMap;
public class HotalMenuDB {
	public HashMap<HotalId, HotalMenu> HotalMenu;
	public HotalMenuDB() {
		this.HotalMenu =new HashMap<>();
	}
	public class HotalId{
		private String Hotalid;
		public HotalId(String Id) {
			this.Hotalid=Id;
		}
		public String getHotalId() {
			return Hotalid;
		}
		@Override
		public String toString() {
			return "HotalId [Hotalid=" + Hotalid + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(Hotalid);
		}
		@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true;
			}
			if(obj == null) {
				return false;
			}
			if(getClass() != obj.getClass()) {
				return false;
			}
			HotalId hId =(HotalId)obj;
			return getHotalId().equals(hId.getHotalId());
		}
	}
	public class HotalMenu{
		HashMap<Iteamname, Iteamcost> menulist;
		public HotalMenu() {
			this.menulist =new HashMap<>();
		}
		public class Iteamname{
			private String iteamname;
			public Iteamname(String iteamname) {
				this.iteamname =iteamname;
			}
			public String getIteamName() {
				return this.iteamname;
			}
			@Override
			public String toString() {
				return "Iteamname [iteamname=" + iteamname + "]";
			}
			@Override
			public int hashCode() {
				return Objects.hash(iteamname);
			}
			@Override
			public boolean equals(Object obj) {
				if(obj==this) {
					return true;
				}
				if(obj == null) {
					return false;
				}
				if(getClass() != obj.getClass()) {
					return false;
				}
				Iteamname tn =(Iteamname)obj;
				return getIteamName().equals(tn.getIteamName());
			}
		}
		public class Iteamcost{
			private int cost;
			public Iteamcost(int cost) {
				this.cost=cost;
			}
			public int getIteamCost() {
				return this.cost;
			}
			@Override
			public String toString() {
				return "Iteamcost [cost=" + cost + "]";
			}
			@Override
			public int hashCode() {
				return Objects.hash(cost);
			}
			@Override
			public boolean equals(Object obj) {
				if(obj==null) {
					return false;
				}
				if(obj==this) {
					return true;
				}
				if(getClass() != obj.getClass()) {
					return false;
				}
				Iteamcost ic =(Iteamcost)obj;
				return getIteamCost() == ic.getIteamCost();
			}
		}
	}
}