import java.util.HashSet;
import java.util.LinkedList;

public class URLPool {

	public int COUNT = 0;
	public HashSet<String> allURL = new HashSet<String>();
	public HashSet<String> allDomain = new HashSet<String>();
	public LinkedList <URLDepthPair> unVisitedList = new LinkedList <URLDepthPair>();
	public LinkedList <URLDepthPair> visitedList = new LinkedList <URLDepthPair>();
	LinkedList <URLDepthPair> noneVisitedList = new LinkedList <URLDepthPair>();

	public void addNoneCheckedURL (URLDepthPair urlpair) {
		noneVisitedList.addLast(urlpair);
	}

	public void addCheckedURL(URLDepthPair urlpair) {
		visitedList.addLast(urlpair);
	}

	public synchronized  boolean addURL(URLDepthPair urlpair){
		if (allURL.contains(urlpair.url)) return false;
		else {
			allURL.add(urlpair.url);
			if (allDomain.contains(urlpair.domain)) unVisitedList.addLast(urlpair);
			else {
				unVisitedList.addFirst(urlpair);
				allDomain.add(urlpair.domain);
			}
			this.notify();
			return true;
		}
	}

	public synchronized URLDepthPair getURL() throws InterruptedException {
		if (unVisitedList.isEmpty()) {
			COUNT++;
			this.wait();
			COUNT--;
			return unVisitedList.pollFirst();
		}
		return unVisitedList.pollFirst();
	}	
}