/**
 * The MIT License (MIT)
 *
 * MSUSEL Config Provider
 * Copyright (c) 2015-2018 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.montana.gsoc.msusel.config

/**
 * The default config provider implementation
 * @author Isaac Griffith
 * @version 1.2.0
 */
class DefaultConfigProvider implements ConfigProvider {

    /**
     * Current local directory
     */
    String localDirectory
    /**
     * Home directory of the app using this config provider
     */
    String homeDirectory
    /**
     * Expected configuration file name
     */
    String configFilename
    /**
     * List of command line arguments to process
     */
    def cmdLineArgs

    /**
     * Constructs a new DefaultConfigProvider
     * @param localDirectory current local directory
     * @param homeDirectory home directory of the application using this config provider
     * @param configFileName expected name of the config file, default value is msusel.config
     */
    DefaultConfigProvider(localDirectory, homeDirectory, configFileName = "msusel.config") {
        this.localDirectory = localDirectory
        this.homeDirectory = homeDirectory
        this.configFilename = configFileName
    }

    @Override
    def loadConfig(String... cmdLineArgs = []) {
        this.cmdLineArgs = cmdLineArgs

        def home = loadHome()
        def local = loadLocal()
        def cmd = loadCmdLine()

        unify(home, local, cmd)
    }

    /**
     * Loads the configuration information from the home directory (in "/config")
     */
    private def loadHome() {

    }

    /**
     * Loads the configuration information from the local directory
     */
    private def loadLocal() {

    }

    /**
     * Parses configuration information from the command line arguments (those starting with -D)
     */
    private def loadCmdLine() {

    }

    /**
     * Unifies the results of the three configurations into a single configuration
     * @param home results of loading the home config
     * @param local results of loading the local config
     * @param cmd results of loading config info from the command line
     */
    private def unify(home, local, cmd) {

    }
}
