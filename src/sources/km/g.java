package km;

import android.content.Context;
import android.content.Intent;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableTest;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f38191a = new t1.d(new k9.q(1), false, -1741973924);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f38192b = new t1.d(new iv.b(11), false, -581849073);

    public static Intent a(Context context, int i11) {
        kotlin.jvm.internal.m.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) SyllableTest.class);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        return intent;
    }
}
