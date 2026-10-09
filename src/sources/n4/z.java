package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43232a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f43233b;

    public z(Context context) {
        this.f43233b = context;
    }

    public final void b(ComponentName componentName) {
        Context context = this.f43233b;
        ArrayList arrayList = this.f43232a;
        int size = arrayList.size();
        try {
            for (Intent intentA = e.a(context, componentName); intentA != null; intentA = e.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final void d() {
        ArrayList arrayList = this.f43232a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f43233b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f43232a.iterator();
    }
}
