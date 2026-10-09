package lw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f40483c = Logger.getLogger(w0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w0 f40484d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f40485a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f40486b = Collections.EMPTY_LIST;

    public static List a() {
        Logger logger = f40483c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(nw.k.class);
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e8);
        }
        try {
            arrayList.add(Class.forName(ealNNtLp.zjGd));
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
