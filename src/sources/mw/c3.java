package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lp.b f42372g = new lp.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f42373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f42374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f42375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f42376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y4 f42377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f42378f;

    public c3(Map map, boolean z11, int i11, int i12) {
        long j11;
        boolean z12;
        y4 y4Var;
        n1 n1Var;
        this.f42373a = e2.i("timeout", map);
        this.f42374b = e2.b("waitForReady", map);
        Integer numF = e2.f("maxResponseMessageBytes", map);
        this.f42375c = numF;
        if (numF != null) {
            Preconditions.f("maxInboundMessageSize %s exceeds bounds", numF.intValue() >= 0, numF);
        }
        Integer numF2 = e2.f("maxRequestMessageBytes", map);
        this.f42376d = numF2;
        if (numF2 != null) {
            Preconditions.f("maxOutboundMessageSize %s exceeds bounds", numF2.intValue() >= 0, numF2);
        }
        Map mapG = z11 ? e2.g("retryPolicy", map) : null;
        if (mapG == null) {
            j11 = 0;
            y4Var = null;
            z12 = true;
        } else {
            Integer numF3 = e2.f("maxAttempts", mapG);
            Preconditions.k(numF3, "maxAttempts cannot be empty");
            int iIntValue = numF3.intValue();
            Preconditions.b(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
            int iMin = Math.min(iIntValue, i11);
            Long lI = e2.i("initialBackoff", mapG);
            Preconditions.k(lI, "initialBackoff cannot be empty");
            long jLongValue = lI.longValue();
            Preconditions.d(jLongValue, "initialBackoffNanos must be greater than 0: %s", jLongValue > 0);
            Long lI2 = e2.i("maxBackoff", mapG);
            Preconditions.k(lI2, "maxBackoff cannot be empty");
            long jLongValue2 = lI2.longValue();
            j11 = 0;
            z12 = true;
            Preconditions.d(jLongValue2, "maxBackoff must be greater than 0: %s", jLongValue2 > 0);
            Double dE = e2.e("backoffMultiplier", mapG);
            Preconditions.k(dE, "backoffMultiplier cannot be empty");
            double dDoubleValue = dE.doubleValue();
            Preconditions.f("backoffMultiplier must be greater than 0: %s", dDoubleValue > 0.0d, dE);
            Long lI3 = e2.i("perAttemptRecvTimeout", mapG);
            Preconditions.f("perAttemptRecvTimeout cannot be negative: %s", lI3 == null || lI3.longValue() >= 0, lI3);
            Set setB = j5.b("retryableStatusCodes", mapG);
            Verify.a("%s is required in retry policy", setB != null, "retryableStatusCodes");
            Verify.a("%s must not contain OK", !setB.contains(lw.p1.OK), "retryableStatusCodes");
            Preconditions.e("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setB.isEmpty()) ? false : true);
            y4Var = new y4(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setB);
        }
        this.f42377e = y4Var;
        Map mapG2 = z11 ? e2.g("hedgingPolicy", map) : null;
        if (mapG2 == null) {
            n1Var = null;
        } else {
            Integer numF4 = e2.f("maxAttempts", mapG2);
            Preconditions.k(numF4, "maxAttempts cannot be empty");
            int iIntValue2 = numF4.intValue();
            Preconditions.b(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2 ? z12 : false);
            int iMin2 = Math.min(iIntValue2, i12);
            Long lI4 = e2.i("hedgingDelay", mapG2);
            Preconditions.k(lI4, "hedgingDelay cannot be empty");
            long jLongValue3 = lI4.longValue();
            Preconditions.d(jLongValue3, "hedgingDelay must not be negative: %s", jLongValue3 >= j11 ? z12 : false);
            Set setB2 = j5.b("nonFatalStatusCodes", mapG2);
            if (setB2 == null) {
                setB2 = Collections.unmodifiableSet(EnumSet.noneOf(lw.p1.class));
            } else {
                Verify.a("%s must not contain OK", !setB2.contains(lw.p1.OK), "nonFatalStatusCodes");
            }
            n1Var = new n1(iMin2, jLongValue3, setB2);
        }
        this.f42378f = n1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return Objects.a(this.f42373a, c3Var.f42373a) && Objects.a(this.f42374b, c3Var.f42374b) && Objects.a(this.f42375c, c3Var.f42375c) && Objects.a(this.f42376d, c3Var.f42376d) && Objects.a(this.f42377e, c3Var.f42377e) && Objects.a(this.f42378f, c3Var.f42378f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42373a, this.f42374b, this.f42375c, this.f42376d, this.f42377e, this.f42378f});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42373a, "timeoutNanos");
        toStringHelperB.c(this.f42374b, "waitForReady");
        toStringHelperB.c(this.f42375c, "maxInboundMessageSize");
        toStringHelperB.c(this.f42376d, "maxOutboundMessageSize");
        toStringHelperB.c(this.f42377e, "retryPolicy");
        toStringHelperB.c(this.f42378f, "hedgingPolicy");
        return toStringHelperB.toString();
    }
}
