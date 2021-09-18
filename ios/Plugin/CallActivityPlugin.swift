import Foundation
import Capacitor

@objc(CallActivityPlugin)
public class CallActivityPlugin: CAPPlugin {
    private let implementation = CallActivity()

    @objc func openActivity(_ call: CAPPluginCall) {
        call.unavailable("Not available in iOS.")
    }
}
