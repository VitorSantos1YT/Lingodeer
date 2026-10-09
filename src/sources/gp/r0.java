package gp;

import com.lingo.lingoskill.http.object.NewsFeed;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String feedId = ((NewsFeed) obj).getFeedId();
        kotlin.jvm.internal.m.e(feedId, "getFeedId(...)");
        Integer numValueOf = Integer.valueOf(Integer.parseInt(feedId));
        String feedId2 = ((NewsFeed) obj2).getFeedId();
        kotlin.jvm.internal.m.e(feedId2, "getFeedId(...)");
        return qx.b.i(numValueOf, Integer.valueOf(Integer.parseInt(feedId2)));
    }
}
