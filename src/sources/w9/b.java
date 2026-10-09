package w9;

import android.content.Context;
import android.content.Intent;
import e6.i1;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka.c f54756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f54757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f54758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f54759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f54760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f54761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f54762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f54763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f54764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f54765l;
    public final Set m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f54766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f54767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f54768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f54769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f54770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f54771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ja.b f54772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final vy.i f54773u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f54774v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f54775w;

    public b(Context context, String str, ka.c cVar, i1 migrationContainer, List list, boolean z11, r journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z12, boolean z13, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z14, ja.b bVar, vy.i iVar) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.m.f(journalMode, "journalMode");
        kotlin.jvm.internal.m.f(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.m.f(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.m.f(typeConverters, "typeConverters");
        kotlin.jvm.internal.m.f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f54754a = context;
        this.f54755b = str;
        this.f54756c = cVar;
        this.f54757d = migrationContainer;
        this.f54758e = list;
        this.f54759f = z11;
        this.f54760g = journalMode;
        this.f54761h = queryExecutor;
        this.f54762i = transactionExecutor;
        this.f54763j = intent;
        this.f54764k = z12;
        this.f54765l = z13;
        this.m = set;
        this.f54766n = str2;
        this.f54767o = file;
        this.f54768p = callable;
        this.f54769q = typeConverters;
        this.f54770r = autoMigrationSpecs;
        this.f54771s = z14;
        this.f54772t = bVar;
        this.f54773u = iVar;
        this.f54774v = intent != null;
        this.f54775w = true;
    }
}
