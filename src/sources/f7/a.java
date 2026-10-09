package f7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f26629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.a0 f26630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bq.f f26631c;

    public a(bq.f fVar, b7.a0 a0Var, x xVar) {
        this.f26631c = fVar;
        this.f26630b = a0Var;
        this.f26629a = xVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("4DjFvX2Rzdc0ixXf", new Object[]{this, context, intent});
    }
}
