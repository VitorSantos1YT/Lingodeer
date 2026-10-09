package k3;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import ch.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int[] a(r rVar, RectF rectF, int i11, final b0 b0Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i11 == 1) {
            graphemeClusterSegmentFinder = new l3.a(new ob.l(19, rVar.f37894f.getText(), rVar.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(rVar.f37894f.getText(), rVar.f37889a);
        }
        return rVar.f37894f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: k3.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) b0Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
