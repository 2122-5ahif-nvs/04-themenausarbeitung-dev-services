rm -rf out
mkdir out
cp images/* out
asciidoctor -r asciidoctor-diagram -D ./out ./*.adoc