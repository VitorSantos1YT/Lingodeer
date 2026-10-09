package zd;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f59150b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f59151a;

    public b0(q qVar) {
        this.f59151a = qVar;
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        return f59150b.contains(((Uri) obj).getScheme());
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, td.j jVar) {
        return this.f59151a.b(new h(((Uri) obj).toString(), i.f59168a), i11, i12, jVar);
    }
}
