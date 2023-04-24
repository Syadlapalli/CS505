

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoComposerDao implements ComposerDao {

	private List<Composer> composers;
	
	public MemoComposerDao() {
		
		initData();
		
	}

	private void initData() {
		Composer composer1 = new Composer();
		composer1.setId(2001);
		composer1.setName("Ludwig");
		composer1.setGenre("Classical");
		
		Composer composer2 = new Composer();
		composer2.setId(2002);
		composer2.setName("Johann Sebastian");
		composer2.setGenre("Classical");
		
		Composer composer3 = new Composer();
		composer3.setId(2003);
		composer3.setName("Wolgang");
		composer3.setGenre("Classical");
		
		Composer composer4 = new Composer();
		composer4.setId(2004);
		composer4.setName("Hyden");
		composer4.setGenre("Classical");
		
		Composer composer5 = new Composer();
		composer5.setId(2005);
		composer5.setName("Brahms");
		composer5.setGenre("Pop");
		ArrayList<Composer> data = new ArrayList<>();
		data.add(composer1);
		data.add(composer2);
		data.add(composer3);
		data.add(composer4);
		data.add(composer5);
		this.composers = data;
	}

	@Override
	public List<Composer> findAll() {
		
		return composers;
	}

	@Override
	public Composer findBy(Integer key) {
		
		for(Composer comp : this.composers) {
			if(comp.getId() == key) {
				return comp;
			}
		}
		
		return null;
				
	}

	@Override
	public void insert(Composer entity) {
		this.composers.add(entity);
		
	}
}
